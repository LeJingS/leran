import java.util.Arrays;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //比较
        System.out.println(Arrays.equals(arr1,arr2));
        //输出
        System.out.println(Arrays.toString(arr1));//包含括号
        //填充
        Arrays.fill(arr1, 0);

        System.out.println(Arrays.toString(arr1));
        //排序
        int[] arr3 = {1, 123, 3, 123, 5, 2323, 7, 8, 9, 0};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        //二分查找，前提必须有序
        int index = Arrays.binarySearch(arr3, 2323);
        //返回下标，找不到返回负数

    }
}