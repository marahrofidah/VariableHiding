public class App {
    {
    Child child = new Child();
    child.dolt();
    System.out.println(child.name);

    Parent parent = (Parent) child;
    parent.dolt();
    System.out.println(parent.name);

    }
}
