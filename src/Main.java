import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int cnt = 0;
        int input;
        Node root;
        root = new Node(25);
        Tree dll = new Tree();
        Scanner sc = new Scanner(System.in);
        while (cnt != 7) {
            System.out.println();
            System.out.println("                     Выберите действие.");
            System.out.println("1.Добавить элемент в дерево 2.Удалить элемент из дерева 3.Поиск элемента в дереве 4.Симметричный 5.Обратный 6.Прямой 7.Выход");
            int num = sc.nextInt();
            cnt = num;
            switch (num) {
                case 1:
                    System.out.println("Введите  число для добавления");
                    input = sc.nextInt();
                    dll.insert(root, input);
                    break;
                case 2:
                    System.out.println("Введите  число для удаления");
                    input = sc.nextInt();
                    dll.delete(root, input);
                    break;
                case 3:
                    System.out.println("Введите  число для поиска");
                    input = sc.nextInt();
                    if (dll.search(input, root) == null) {
                        System.out.println("Элемент в дереве не найден");
                    } else {
                        System.out.println("Элемент в дереве найден");
                    }
                    break;
                case 4:
                    System.out.println("Симметричный обход:");
                    dll.print(root);
                    break;
                case 5:
                    System.out.println("Обратный обход:");
                    dll.print2(root);
                    break;
                case 6:
                    System.out.println("Прямой обход:");
                    dll.print3(root);
                    break;

            }
        }
    }
}
