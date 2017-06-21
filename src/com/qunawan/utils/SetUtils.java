package com.qunawan.utils;

import java.util.Iterator;
import java.util.Set;

public class SetUtils {
	public static Object getSet(Set<Object> set) {
		Iterator it = set.iterator();
		return it.next();
	}
}
