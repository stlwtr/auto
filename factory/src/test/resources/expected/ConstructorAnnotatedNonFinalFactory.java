/*
 * Copyright (C) 2013 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tests;

import com.google.auto.factory.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated(
  value = "com.google.auto.factory.processor.AutoFactoryProcessor",
  comments = "https://github.com/google/auto/tree/master/factory"
  )
class ConstructorAnnotatedNonFinalFactory {
  private final Provider<Object> objProvider;

  @Inject ConstructorAnnotatedNonFinalFactory(Provider<Object> objProvider) {
    this.objProvider = Preconditions.checkNotNull(objProvider, 1);
  }

  ConstructorAnnotatedNonFinal create() {
    return new ConstructorAnnotatedNonFinal();
  }

  ConstructorAnnotatedNonFinal create(String s) {
    return new ConstructorAnnotatedNonFinal(Preconditions.checkNotNull(s, 1));
  }

  ConstructorAnnotatedNonFinal create(int i) {
    return new ConstructorAnnotatedNonFinal(Preconditions.checkNotNull(objProvider.get(), 1), i);
  }

  ConstructorAnnotatedNonFinal create(char c) {
    return new ConstructorAnnotatedNonFinal(Preconditions.checkNotNull(objProvider.get(), 1), c);
  }
}
