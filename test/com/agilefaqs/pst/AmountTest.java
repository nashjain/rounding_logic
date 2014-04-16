package com.agilefaqs.pst;

import static com.agilefaqs.pst.Amount.round;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AmountTest {

	@Test
	public void shouldLeaveAsIsIfAlreadyInDenominationsOf5Cents() {
		assertEquals(20.25, round(20.25), 0.01);
	}

	@Test
	public void shouldRoundUpToNext5Cents() {
		assertEquals(20.25, round(20.24), 0.01);
	}

	@Test
	public void shouldRoundUpEvenIfAmountIsLessThanPoint023() {
		assertEquals(20.25, round(20.21), 0.01);
	}

}
