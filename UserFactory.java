/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdental;
public class UserFactory {
    public static User createUser(String name, int age) {
        return new User(name, age);
    }
}


