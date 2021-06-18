
class Tree {
     // метод поиска элемента в дереве
     public static Node search(int x, Node n) {
         if (n == null || n.getData() == x) //если x = элементу, то элемент найден.

             return n;
         else if (n.getData() > x) // если x больше,ищем в правом поддереве.
             return search(x, n.getLeftChild());
         else //Если x меньше , ищем в левом поддереве.
             return search(x, n.getRightChild());
     }
     //метод поиска минимального значения в дереве
     public static Node findMinimum(Node root){
         if(root==null)
             return null;
         else if(root.getLeftChild() != null) // узел с минимальным значением не будет иметь левого потомка
             return findMinimum(root.getLeftChild()); // самый левый элемент будет минимальным
         return root;
     }
     //Метод вставки нового узла
     public static Node insert(Node root, int x){
         if (root == null)
             return new Node(x);
         else if(x>root.getData()) // X больше, вставляем  вправо
             root.setRightChild(insert(root.getRightChild(),x));
         else // X меньше, вставка влево
             root.setLeftChild(insert(root.getLeftChild(),x));
         return root;
     }
     // Метод удаления
     public static Node delete(Node root, int x){
         //Поиск элемента для удаления
         if(root==null)
             return null;
         if (x>root.getData())
             root.setRightChild(delete(root.getRightChild(), x));
         else if(x<root.getData())
             root.setLeftChild(delete(root.getLeftChild(), x));
         else
         {
             //Если нет потомков
             if(root.getLeftChild()==null && root.getRightChild()==null)
             {
                 root = null;
                 return null;
             }

             //Один потомок
             else if(root.getLeftChild()==null || root.getRightChild()==null)
             {
                 Node temp;
                 if(root.getLeftChild()==null)
                     temp = root.getRightChild();
                 else
                     temp = root.getLeftChild();
                 root = null;
                 return temp;
             }

             //Два потомка
             else
             {
                 Node temp = findMinimum(root.getRightChild());
                 root.setData(temp.getData());
                 root.setRightChild(delete(root.getRightChild(), temp.getData()));
             }
         }
         return root;
     }

     public static void print(Node root){

         if(root!=null){ // проверка, не является ли  нулевым

         if(root.getLeftChild()!=null){
             print( root.getLeftChild()); //  левые потомки
         }
             System.out.print("   "+root.getData()+"   ");
         if(root.getRightChild()!=null) {
             print(root.getRightChild()); // правые потомки
         }
         }
     }
    public static void print2(Node root){

        if(root!=null){ // проверка, не является ли  нулевым

            if(root.getLeftChild()!=null){
                print( root.getLeftChild()); //  левые потомки
            }

            if(root.getRightChild()!=null) {
                print(root.getRightChild()); // правые потомки
            }
            System.out.print("   "+root.getData()+"   ");
        }
    }
    public static void print3 (Node root){

        if(root!=null){ // проверка, не является ли  нулевым

            System.out.print("   "+root.getData()+"   ");
            if(root.getLeftChild()!=null){
                print( root.getLeftChild()); //  левые потомки
            }

            if(root.getRightChild()!=null) {
                print(root.getRightChild()); // правые потомки
            }
        }
    }
     }


