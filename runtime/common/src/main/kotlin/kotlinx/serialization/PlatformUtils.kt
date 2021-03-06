/*
 * Copyright 2017 JetBrains s.r.o.
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

package kotlinx.serialization

import kotlin.reflect.KClass

header fun <T: Any> KClass<T>.serializer(): KSerializer<T>

header fun String.toUtf8Bytes(): ByteArray
header fun stringFromUtf8Bytes(bytes: ByteArray): String

header fun <E: Enum<E>> enumFromName(enumClass: KClass<E>, value: String): E
header fun <E: Enum<E>> enumFromOrdinal(enumClass: KClass<E>, ordinal: Int): E

header fun <E: Enum<E>> KClass<E>.enumClassName(): String

header fun <E: Any> ArrayList<E?>.toNativeArray(eClass: KClass<E>): Array<E?>