package com.example.demo.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import java.util.SplittableRandom;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.example.demo.utils.Constructor.ConstructorBuilder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ConstructorTest {

//	@Test
//	@Order(0)
//	void test2() {
//		long result = LongStream.rangeClosed(2, 10000000L)
//								.parallel()
//								.mapToObj(BigInteger::valueOf)
//								.filter(i -> i.isProbablePrime(50))
//								.count();
//		System.out.println("test2 : " + result);
//	}
	@Test
	@Order(1)
	void test() {
//		long result = LongStream.rangeClosed(2, 10000000L)
//								.mapToObj(BigInteger::valueOf)
//								.filter(i -> i.isProbablePrime(50))
//								.count();
//		System.out.println("test1 : " + result);
		System.out.println(ThreadLocalRandom.current().nextInt());
		System.out.println(ThreadLocalRandom.current().nextInt());
		System.out.println(ThreadLocalRandom.current().nextInt());
		System.out.println(ThreadLocalRandom.current().nextInt());
		System.out.println(ThreadLocalRandom.current().nextInt());
		System.out.println(ThreadLocalRandom.current().nextInt());
		System.out.println(ThreadLocalRandom.current().nextInt());
//		SplittableRandom sr = new SplittableRandom();
		ForkJoinPool p = new ForkJoinPool(4);
		p.submit(() -> {
			IntStream.rangeClosed(1, 1000)
			.parallel()
			.forEach(
					a-> {
						System.out.println(Thread.currentThread().getName() + ", " + a + ", " + new SplittableRandom().nextInt());
					});
		});
		p.shutdown();
	}
}
