package com.bharti.utils;

import java.util.List;
import java.util.Set;

public class MyUtils {

	private MyUtils() {

	}

	@SuppressWarnings("unchecked")
	public static <T> boolean isCheckIfParamsNullOrEmpty(T... listT) {
		for (T t : listT) {
			if (t == null || t == "") {
				return true;
			}
		}
		return false;
	}

	/***
	 * This method is used to check whether list is null or empty.
	 * 
	 * @param listT
	 *            indicates any list of any type.
	 * @return returns true if list is null or empty, otherwise it returns false
	 */
	public static <T> boolean isListIsNullOrEmpty(List<T> listT) {
		return (listT == null || listT.isEmpty()) ? true : false;
	}

	public static <T> boolean isSetIsNullOrEmpty(Set<T> setT) {
		return (setT == null || setT.isEmpty()) ? true : false;
	}

	@SuppressWarnings("unchecked")
	public static <T> boolean isObjectIsNullOrEmpty(T... t) {
		for (T object : t) {
			if (object == null || object.toString().trim().isEmpty()) {

				return true;
			}
		}
		return false;
	}
}
