class Solution:
    def reverse(self, nums: List[int], i: int, j: int) -> None:
        while i < j:
            nums[i], nums[j] = nums[j], nums[i]
            i += 1
            j -= 1

    def rotate(self, nums: List[int], k: int) -> None:
        n = len(nums)
        k = k % n

        self.reverse(nums, n - k, n - 1)
        self.reverse(nums, 0, n - k - 1)
        self.reverse(nums, 0, n - 1)
        