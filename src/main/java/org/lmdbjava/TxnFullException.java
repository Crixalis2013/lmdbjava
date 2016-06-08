/*
 * Copyright 2016 LmdbJava
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
package org.lmdbjava;

/**
 * Transaction has too many dirty pages.
 */
public final class TxnFullException extends LmdbNativeException {

  private static final long serialVersionUID = 1L;
  static final int MDB_TXN_FULL = -30_788;

  TxnFullException() {
    super(MDB_TXN_FULL, "Transaction has too many dirty pages");
  }
}