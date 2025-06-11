package com.example.behavioral.composite;
import java.awt.Color;

import com.example.behavioral.composite.editor.ImageEditor;
import  com.example.behavioral.composite.shapes.Circle;
import com.example.behavioral.composite.shapes.Rectangle;
public class Demo {
  public static void main(String[] args) {
      ImageEditor editor = new ImageEditor();
      editor.loadShapes(
          new Circle(50, 60, 27, Color.BLACK),
          new Rectangle(100, 100, 50, 75, Color.BLUE)
      );
  }
}
