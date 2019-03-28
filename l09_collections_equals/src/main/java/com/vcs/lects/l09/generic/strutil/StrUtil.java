package com.vcs.lects.l09.generic.strutil;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StrUtil {

	public static <T> String toStr(String sep, ToStringConverter<T> conv, Comparator<T> comparator, T... objs) {

		 Arrays.sort(objs, comparator);

		String result = "";
		for (T obj : objs) {
			result += conv.convertToString(obj) + sep;
		}

		return result;
	}

	public static <T> String toStr(T... objs) {
		return toStr(Arrays.asList(objs));
	}

	public static <T> String toStr(List<T> objs) {
		return toStr(", ", ((o1, o2) -> o1.hashCode() - o2.hashCode()), (o) -> o.toString(), objs);
	}

	public static <T> String toStr(String sep, Comparator<T> cmp, Function<T, String> toStrConverter, T... objs) {
		return toStr(sep, cmp, toStrConverter, Arrays.asList(objs));
	}

	public static <T> String toStr(String sep, Comparator<T> cmp, Function<T, String> toStrConverter, List<T> objs) {
		return objs.stream().sorted(cmp).map(toStrConverter).collect(Collectors.joining(sep));
	}

}
