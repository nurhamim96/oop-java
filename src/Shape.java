class Shape {
    int getConner() {
        return 0;
    }
}

class Rectangle extends Shape{
    int getConner() {
        return 4;
    }

    int getParentConner() {
        return super.getConner();
    }
}

