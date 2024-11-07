package com.example.onlinestoremanagementsystem.users

import com.example.onlinestoremanagementsystem.products.Product
import com.example.onlinestoremanagementsystem.purchase.Purchase
/**
 * Represents a customer in the store system.
 *
 * @property id Unique identifier for the customer.
 * @property name Name of the customer.
 * @property email Email address of the customer.
 * @property purchaseList List of products currently held by the customer.
 * @property purchaseHistory List of the customer’s past purchases.
 */
class Customer(
    override val id: Int,
    override val name: String,
    override val email: String,
    override val purchaseList: MutableList<Product>,
    override val purchaseHistory: MutableList<Purchase>
) : User() {
    /**
     * Prints detailed information about the customer, including their purchase history.
     */
    override fun printUserInfo() {
        println("Customer:")
        super.printUserInfo()
        println("purchase history: ${purchaseHistory.joinToString()}")
    }
}