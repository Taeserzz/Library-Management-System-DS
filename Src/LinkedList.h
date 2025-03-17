/*
Data Structures - UM3
Name: La-Tavia Pearce
ID#: 2305853
Lab Test 1 
*/
#ifndef LINKEDLIST_H
#define LINKEDLIST_H 

#include "Product.h"

class Node {
public: 
    Product* data;
    Node* next;
    
    Node(Product* product) {
        data = product;
        next = nullptr;
    }
};

class LinkedList {
private:
    Node* head;
    
public: 
    LinkedList() { head = nullptr; } 
    
    // Insert new product at the back 
    void InsertAtBack(int id, string name, double price) {
        Product* newProduct = new Product(id, name, price);
        Node* newNode = new Node(newProduct);
        
        if (head == nullptr) {
            head = newNode;
        } else {
            Node* temp = head; 
            while (temp->next != nullptr) {
                temp = temp->next;
            }
            temp->next = newNode;
        }
    }
    
    // Display all nodes 
    void DisplayNodes() {
        Node* temp = head;
        while (temp != nullptr) {
            cout << "{" << temp->data->productId << ", " << temp->data->productName 
                << ", " << temp->data->productPrice << "}" << endl;
            temp = temp->next; 
        }
    }
    
    // Count total nodes 
    int CountNodes() {
        int count = 0; 
        Node* temp = head;
        while (temp != nullptr) {
            count++;
            temp = temp->next;
        } 
        return count; 
    }
    
    // Calculate average product price 
    double AverageProductPrice() {
        if (head == nullptr) return 0;
        double sum = 0;
        int count = 0; 
        Node* temp = head; 
        while (temp != nullptr) {
            sum += temp->data->productPrice;
            count++;
            temp = temp->next;
        }
        return (count == 0) ? 0 : sum/ count;
    }
    
    // Display products with price >= 50 
    void Display50AndAbove() {
        Node* temp = head;
        while (temp != nullptr) {
            if (temp->data->productPrice >= 50) {
                cout << "{" << temp->data->productId << ", " << temp->data->productName 
                    << ", " << temp->data->productPrice << "}" << endl; 
            }
            temp = temp->next;
        }
    }
}; 
#endif 