/*
 * SPDX-License-Identifier: (MIT OR CECILL-C)
 *
 * Copyright (C) 2006-2023 INRIA and contributors
 *
 * Spoon is available either under the terms of the MIT License (see LICENSE-MIT.txt) or the Cecill-C License (see LICENSE-CECILL-C.txt). You as the user are entitled to choose the terms under which to adopt Spoon.
 */
package spoon.support.visitor.equals;

import spoon.SpoonException;

class NotEqualException extends SpoonException {
	static final NotEqualException INSTANCE = new NotEqualException();

	private NotEqualException() {
	}
}
