import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class L2022111989_5_Test {

	/*
	测试类要涵盖以下几个方面：
		等价类划分原则：为每个输入类别设计测试用例，保证包含正常情况、边界情况和异常情况。
		边界条件：测试数组长度最小的情况（1个元素）和最大值情况（长数组），以及极限值处理。
		性能测试：考虑大数据量情况下的处理能力。
	 */

	/**
	 * 测试目的：验证正常情况下的功能，确保算法按预期工作
	 * 测试用例：小数组和有重复的情况
	 */
	@org.junit.Test
	@Test
	public void testNormalCases() {
		Solution5 solution = new Solution5();

		int[] nums1 = {3, 5, 6, 7};
		int target1 = 9;
		assertEquals(4, solution.numSubseq(nums1, target1));  // 预期输出 4

		int[] nums2 = {3, 3, 6, 8};
		int target2 = 10;
		assertEquals(6, solution.numSubseq(nums2, target2));  // 预期输出 6

		int[] nums3 = {2, 3, 3, 4, 6, 7};
		int target3 = 12;
		assertEquals(61, solution.numSubseq(nums3, target3));  // 预期输出 61
	}

	/**
	 * 测试目的：验证边界情况，尤其是输入数组长度为1的情形
	 * 测试用例：单元素数组，target小于大于该元素的情况
	 */
	@Test
	public void testEdgeCases() {
		Solution5 solution = new Solution5();

		int[] nums1 = {1};
		int target1 = 2;
		assertEquals(1, solution.numSubseq(nums1, target1));  // 预期输出 1

		int[] nums2 = {5};
		int target2 = 3;
		assertEquals(0, solution.numSubseq(nums2, target2));  // 预期输出 0
	}

	/**
	 * 测试目的：性能测试，验证在大数据量时算法的效率
	 * 测试用例：大规模数组的情况
	 */
	@Test
	public void testLargeInput() {
		Solution5 solution = new Solution5();

		int[] nums = new int[100000];
		Arrays.fill(nums, 1);
		int target = 1000000;
		assertTrue(solution.numSubseq(nums, target) > 0);  // 大数据量时，检查输出大于0
	}
}
