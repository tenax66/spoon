/*
 * SPDX-License-Identifier: (MIT OR CECILL-C)
 *
 * Copyright (C) 2006-2023 INRIA and contributors
 *
 * Spoon is available either under the terms of the MIT License (see LICENSE-MIT.txt) or the Cecill-C License (see LICENSE-CECILL-C.txt). You as the user are entitled to choose the terms under which to adopt Spoon.
 */
package spoon.support.reflect.code;

import spoon.reflect.code.CtVariableRead;
import spoon.reflect.visitor.CtVisitor;

public class CtVariableReadImpl<T> extends CtVariableAccessImpl<T> implements CtVariableRead<T> {
	private static final long serialVersionUID = 1L;

	@Override
	public void accept(CtVisitor visitor) {
		visitor.visitCtVariableRead(this);
	}

	@Override
	public CtVariableRead<T> clone() {
		return (CtVariableRead<T>) super.clone();
	}
}
