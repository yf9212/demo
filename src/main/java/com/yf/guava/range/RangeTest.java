package com.yf.guava.range;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.google.common.collect.BoundType;
import com.google.common.collect.Range;

/**
 * (a..b) = {x | a < x < b}  	open(a,b)
 * [a..b] = {x | a <= x <= b}  	closed(a,b)
 * [a..b) = {x | a <= x < b}  	closedOpen(a,b)
 * (a..b] = {x | a < x <= b}  	openCloesed(a,b)
 * (a..+∞) = {x | x > a}  		greaterThan(a)
 * [a..+∞) = {x | x >= a} 		atLeast(a)
 * (-∞..b) = {x | x < b}  		lessThan(b)
 * (-∞..b] = {x | x <= b}  		atMost(b)
 * (-∞..+∞) = 所有值                           		all()
 * @author yang.f3
 *
 */
public class RangeTest {
	
	@Test
	public void range(){
		Range<String>  range=Range.range("a", BoundType.CLOSED, "z", BoundType.CLOSED);
		System.out.println(range.apply("小子"));
	}
	
	public Date parse(String date) throws ParseException{
		return new SimpleDateFormat("yyyy-MM-dd").parse(date);
	}
	
	public String format(Date date){
		return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}
	
	@Test
	public void  dateRange() throws ParseException{
		Range<Date> range=Range.closed(parse("2017-01-01"), parse("2017-12-31"));
		System.out.println(range.contains(parse("2017-08-01")));
	}
	
	
	/**
	 * 包含[enclose]</br>
	 *	区间之间的最基本关系就是包含[encloses(Range)]：如果内区间的边界没有超出外区间的边界， 则外区
	 *	间包含内区间。 包含判断的结果完全取决于区间端点的比较！</br>
	 *	[3..6] 包含[4..5] ；</br>
	 *	(3..6) 包含(3..6) ；</br>
	 *	[3..6] 包含[4..4)， 虽然后者是空区间；</br>
	 *	(3..6]不 包含[3..6] ；</br>
	 *	[4..5]不 包含(3..6)， 虽然前者包含了后者的所有值；</br>
	 *	[3..6]不 包含(1..1]， 虽然前者包含了后者的所有值。</br>
	 * @throws ParseException
	 */
	
	@Test
	public void enclose() throws ParseException{
		Range<Date> range=Range.closed(parse("2017-01-01"), parse("2017-12-31"));
		boolean result=range.encloses(Range.open(parse("2017-01-01"), parse("2017-12-31")));
		System.out.println(result);
	}
	
	/**
	 * 相连[isConnected]</br>
		Range.isConnected(Range)判断区间是否是相连的。</br> 具体来说， isConnected测试是否有区间同时包
		含于这两个区间， 这等同于数学上的定义”两个区间的并集是连续集合的形式”（空区间的特殊情况除外） 。
		相连是一种自反的[reflexive]、 对称的[symmetric]关系。
		Range.closed(3, 5).isConnected(Range.open(5, 10));  returns true</br>
		Range.closed(0, 9).isConnected(Range.closed(3, 4));  returns true</br>
		Range.closed(0, 5).isConnected(Range.closed(3, 9));  returns true</br>
		Range.open(3, 5).isConnected(Range.open(5, 10));  returns false</br>
		Range.closed(1, 5).isConnected(Range.closed(6, 10));  returns false
	 * @throws ParseException 
	 */
	@Test
	public void  isConnecetd() throws ParseException{
		Range<Date> range=Range.closed(parse("2017-01-01"), parse("2017-12-31"));
		boolean result=range.encloses(Range.open(parse("2017-05-01"), parse("2017-12-01")));
		System.out.println(result);
	}
	
	/**
	 * 交集[intersection]</br>
		Range.intersection(Range)返回两个区间的交集：既包含于第一个区间， 又包含于另一个区间的最
		大区间。 </br>当且仅当两个区间是相连的， 它们才有交集。 如果两个区间没有交集， 该方法将抛出IllegalArgumentException
	 * @throws ParseException 
	 */
	@Test
	public void intersection() throws ParseException{
		Range<Date> range=Range.closed(parse("2017-01-01"), parse("2017-12-31"));
		Range<Date> result=range.intersection(Range.open(parse("2017-05-01"), parse("2017-12-01")));
		System.out.println(format(result.lowerEndpoint())+":"+format(result.upperEndpoint()));
	}
	/**
	 * 跨区间[span]
		Range.span(Range)返回”同时包括两个区间的最小区间”， 如果两个区间相连， 那就是它们的并集。
	 * @throws ParseException
	 */
	@Test
	public  void span() throws ParseException{
		Range<Date> range=Range.closed(parse("2017-01-01"), parse("2017-12-31"));
		Range<Date> result=range.span(Range.open(parse("2018-05-01"), parse("2018-12-01")));
		System.out.println(format(result.lowerEndpoint())+":"+format(result.upperEndpoint()));
		
		Range<Date> range1=Range.closed(parse("2017-01-01"), parse("2017-05-31"));
		Range<Date> result1=range1.span(Range.open(parse("2017-02-01"), parse("2017-06-01")));
		System.out.println(format(result1.lowerEndpoint())+":"+format(result1.upperEndpoint()));
	}
}
