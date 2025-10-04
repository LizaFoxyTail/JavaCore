package org.lessons.lesson03;

public class Rectangle {

        double length;
        double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double CalculateSquare(){
            return  length * width;
        }

        public double CalculatePerimeter(){
            return 2 * (length + width);
        }
}
