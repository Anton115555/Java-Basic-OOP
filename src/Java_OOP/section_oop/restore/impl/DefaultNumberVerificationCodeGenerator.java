/*
 * Copyright {2021} {devonline.academy}
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package Java_OOP.section_oop.restore.impl;

import Java_OOP.section_oop.restore.VerificationCodeGenerator;

import java.util.Random;

public final class DefaultNumberVerificationCodeGenerator implements VerificationCodeGenerator {

    private Random random = new Random();

    private int length;

    public DefaultNumberVerificationCodeGenerator(int length) {
        this.length = length;
    }

    public DefaultNumberVerificationCodeGenerator() {
        this(20);
    }

    @Override
    public String generate() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        return stringBuilder.toString();
    }
}