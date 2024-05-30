public class Chapter4Ex2 
{
    public static void main(String[] args) 
    {
        String[] array = {"banana", "apple", "orange", "grape", "pineapple"};
        sort(array);
        for (String s : array) 
        {
            System.out.print(s + " ");
        }
    }

    public static void sort(String[] a) 
    {
        int n = a.length;
        for (int i = 1; i < n; i++) 
        {
            for (int j = i; j > 0; j--)
            {
                if (a[j - 1].compareTo(a[j]) > 0)
                 {
                    exchange(a, j - 1, j);
                }
                 else 
                 {
                    break;
                }
            }
        }
    }

    private static void exchange(String[] a, int i, int j) 
    {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}


