/*
Data Structures - UM3
Name: La-Tavia Pearce
ID#: 2305853
Lab Test 1 
*/
#ifndef PRODUCT_H 
#define PRODUCT_H 

#include <iostream> 
using namespace std;

class Product {
public: 
    int productId;
    string productName;
    double productPrice;
    
    Product(int id, string name, double price) {
        productId = id;
        productName = name;
        productPrice = price;
    }
};

#endif 