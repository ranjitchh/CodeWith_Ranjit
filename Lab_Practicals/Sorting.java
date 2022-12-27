
public class Sorting {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            // taking input from argument
            for (int i = 0; i < 5; i++)
                a[i] = Integer.parseInt(args[i]);
            // input numbers
            System.out.println("Before sorting ");
            for (int i = 0; i < 5; i++)
                System.out.println(" " + a[i]);
            // performing bubble sort operation
            BubbleSort(a, 5);
            // after sorting in ascending order
            System.out.println("after sorting ");
            System.out.println("ascending order");
            for (int i = 0; i < 5; i++)
                System.out.println(" " + a[i]);
            // after sorting in descending order
            System.out.println("descending order");
            for (int i = 4; i >= 0; i--)
                System.out.println(" " + a[i]);
        } 
        
        catch (NumberFormatException e) 
        {
            System.out.println("enter only integers");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("enter only 5 integers");
        }
    }

    private static void BubbleSort(int[] arr, int length) 
        {
            int temp, i, j;
            for (i = 0; i < length - 1; i++) {
                for (j = 0; j < length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1])
                      {  temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                      }
                }
            }
        }

    }
