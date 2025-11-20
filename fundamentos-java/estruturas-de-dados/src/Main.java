void main() {
    List<Produto> list = new ArrayList<>();

    list.add(new Produto(1, "p1", 1.00));
    list.add(new Produto(2, "p2", 2.00));
    list.add(new Produto(3, "p3", 3.00));
    list.add(new Produto(4, "p4", 4.00));
        
    IO.println("List: " + list);

    Set<Produto> set = new HashSet<>();

    set.add(new Produto(1, "p1", 1.00));
    set.add(new Produto(1, "p1", 1.00));

    IO.println("Set: " + set);
}
