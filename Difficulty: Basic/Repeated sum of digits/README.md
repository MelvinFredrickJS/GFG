<h2><a href="https://www.geeksforgeeks.org/problems/repeated-sum-of-digits3955/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card">Repeated sum of digits</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an integer N, recursively sum digits of N until we get a single digit.&nbsp; The process can be described below</span></p>

<pre><span style="font-size:18px">If N &lt; 10    
    digSum(N) = N
Else         
    digSum(N) = Sum(digSum(N))
</span>
</pre>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:</span></strong>
<span style="font-size:18px">N = 1234</span>
<strong><span style="font-size:18px">Output:</span></strong>
<span style="font-size:18px">1</span>
<strong><span style="font-size:18px">Explanation:</span></strong>
<span style="font-size:18px">The sum of 1+2+3+4 = 10, 
digSum(x) == 10 Hence 
ans will be 1+0 = 1</span></pre>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:</span></strong>
<span style="font-size:18px">N = 9999</span>
<strong><span style="font-size:18px">Output:</span></strong>
<span style="font-size:18px">9</span>
<strong><span style="font-size:18px">Explanation:</span></strong>
<span style="font-size:18px">Check it yourself.</span></pre>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Your Task:</span></strong></p>

<p><span style="font-size:18px">You don't need to read input or print anything. Your task is to complete the function repeatedSumOfDigits() which takes an integer N and returns the repeated sum of digits of N.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(1)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints: </strong></span></p>

<p><span style="font-size:18px">1 ≤ N ≤ 1000000</span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>number-theory</code>&nbsp;<code>Mathematical</code>&nbsp;<code>Algorithms</code>&nbsp;