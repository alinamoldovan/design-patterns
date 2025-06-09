/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alina
 */


public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>HTML Button</button>");
    }

    @Override
    public void onClick() {
        System.out.println("HTML Button clicked!");
    }

}
