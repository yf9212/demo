package com.yf.guava;

import static com.google.common.base.Objects.equal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.google.common.base.Objects;

public class ObjectsTest {

	@Test
	public void equals() {
		System.out.println(Objects.equal(0.5f, new Float("0.5")));
		System.out.println(equal(new Short("5"), 5));
	}

	private Date parse(String date, String format) {
		try {
			return new SimpleDateFormat(format).parse(date);
		} catch (ParseException e) {
			return null;
		}
	}

	@Test
	public void equalsDate() throws Exception {
		Date date = parse("2017-01-02", "yyyy-MM-dd");
		Date date1 = parse("2017/01/01", "yyyy/MM/dd");
		System.out.println(Objects.equal(date, date1));
	}

	@Test
	public void firstNonNull() {
		User u = Objects.firstNonNull(new User(1, "张三"), new User(2, "李四"));
		System.out.println(u);
		User u1 = Objects.firstNonNull(null, new User(2, "李四"));
		System.out.println(u1);
		User u2 = Objects.firstNonNull(new User(2, "李四"), null);
		System.out.println(u2);
		User u3 = Objects.firstNonNull(null, null);
		System.out.println(u3);
	}

}
