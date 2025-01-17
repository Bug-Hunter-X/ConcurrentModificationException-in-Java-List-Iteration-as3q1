public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        for (Integer num : list) {
            if (num % 2 == 0) {
                list.remove(num);
            }
        }
        System.out.println(list);
    }
}