import java.util.*;
class Book1
{
public static void main (String[]args)
{
Scanner sc = new Scanner (System.in);
int n = sc.nextInt ();
int a[][] = new int[n][n];
for (int i = 0; i < n; i++)
for (int j = 0; j < n; j++)
a[i][j] = sc.nextInt ();
int res[][] = new int[n][n];
boolean visit[][] = new boolean[n][n];
visit[0][0] = true;
for (int i = 0; i < n; i++)
{
for (int j = 0; j < n; j++)
{
if (i == 0 && j == 0)
continue;
if (a[i][j] == 0)
{
if (i == 0 && j != 0 && a[i][j - 1] == 0 && visit[i][j - 1])
{
res[i][j] = res[i][j - 1] + 1;
visit[i][j] = true;
}
if (i != 0 && j == 0 && a[i - 1][j] == 0 && visit[i - 1][j])
{
res[i][j] = res[i - 1][j] + 1;
visit[i][j] = true;
}
if (i == j && a[i - 1][j - 1] == 0 && visit[i - 1][j - 1])
{
res[i][j] = res[i - 1][j - 1] + 1;
visit[i][j] = true;
}
else if (i != 0 && j != 0)
{
if (a[i - 1][j] == 0 && a[i][j - 1] == 0
&& visit[i - 1][j] && visit[i][j - 1])
{
res[i][j] =(res[i][j - 1] <
res[i - 1][j] ? res[i][j - 1] : res[i - 1][j]) + 1;
visit[i][j] = true;
}
else if (a[i - 1][j] == 0 && visit[i - 1][j])
{
res[i][j] = res[i - 1][j] + 1;
visit[i][j] = true;
}
else if (a[i][j - 1] == 0 && visit[i][j - 1])
{
res[i][j] = res[i][j - 1] + 1;
visit[i][j] = true;
}
}
}
}
}
System.out.println (res[n - 1][n - 1]);
}
}
