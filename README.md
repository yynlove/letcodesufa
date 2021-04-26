# letcodesufa
##动态规划  三要数
	1.存在重叠子问题 （子问题空间必须足够小，即问题的递归算法会反复地求解相同的子问题，而不是一直生成新的子问题。对于每个子问题求解一次，将解存入表中，当再次需要这个子问题，直接查表）
	2.具备最优子结构（一个问题的最优解包含其子问题的最优解）
	3.状态转移方程
	
	最优子结构：子问题必须相互独立，同一个原问题的一个子问题的解不影响另一个子问题的解。
	
	正确的状态转移方程：
		1. 先确定【状态】 也就是原问题和子问题中变化的变量 【什么是原问题 ，什么是子问题】
		2.确定dp函数的定义 
		3.确定【选择】并择优 也就是说 对于每个状态，可以做出多少选择改变当前状态
		4.最后明确 base case
    动态规划算法：
        1. 刻画一个最优解的结构特征（寻找最优子结构）。
        2. 递归地定义最优解的值（递归地定义原问题最优解的代价）。
        3. 计算最优解的值，通常采用自底向上的方法，另外还有自顶向下备忘算法。
        4. 利用计算出的信息构造一个最优解。
##回溯算法：一个决策树的遍历过程。
	1.路径：也就是已经做出的选择
	2.选择列表：也就是你当前可以做的选择
	3.结束条件：也就是到达决策树底层，无法再做选择的条件。
	
	result = []
		def backtrack(路径, 选择列表):
		if 	满⾜结束条件:
			result.add(路径)
			return
		for 选择 in 选择列表:
			做选择
			backtrack(路径, 选择列表)
			撤销选择
>查询表和动态规划的区别：	查询表自顶向下 动态规划自底向上
## 贪心算法
    1、将最优化问题转化为这样的形式：对其做出一次选择后，只剩下一个子问题需要求解。
    2、证明做出贪心选择后，原问题总是存在最优解，即贪心选择总是安全的。
    3、证明做出贪心选择后，剩余的子问题满足性质:其最优解与贪心选择组合即可得到原问题的最优解，这样就得到了最优子结构。
    
    贪心算法的两个关键要素：贪心选择性质和最优子结构。
    最优子结构：如果一个问题的最优解包含其子问题的最优解。
    
    
    
