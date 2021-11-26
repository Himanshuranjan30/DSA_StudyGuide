def maxA(N: int) -> int:

    # It can be verified that for the initial (n, a_num, copy) state,
    # there can be at most dp (n, a_num, copy) 'A' on the screen.
    def dp(n, a_num, copy):
        # base case
        if n <= 0: return a_num;
        # Let ’s try all three options and choose the largest one.
        return max(
                dp(n - 1, a_num + 1, copy),    # [ A ]
                dp(n - 1, a_num + copy, copy), # [Ctrl-V]
                dp(n - 2, a_num, a_num)        # [Ctrl-A] & [Ctrl-C]
            )

    # You can press the key n times, then there is no 'A' in the screen
    # and the clipboard.
    return dp(N, 0, 0)
