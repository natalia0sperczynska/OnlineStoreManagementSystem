package com.example.onlinestoremanagementsystem.users

import com.example.onlinestoremanagementsystem.products.Product
import com.example.onlinestoremanagementsystem.purchase.PaymentMethods
import com.example.onlinestoremanagementsystem.purchase.Purchase
import com.example.onlinestoremanagementsystem.purchase.purchasable
import java.time.LocalDate
/**
 * Represents a user in the store system.
 */
abstract class User() : purchasable {
    abstract val id: Int
    abstract val name: String
    abstract val email: String
    abstract val purchaseList: MutableList<Product>
    abstract val purchaseHistory: MutableList<Purchase>

    /**
     * Finalizes the purchase by creating a new [Purchase] object with the current purchase list.
     * Adds the purchase to the user's purchase history, clears the purchase list, and returns the purchase.
     *
     * @param paymentMethod The method of payment used for this purchase.
     * @return The [Purchase] object representing the finalized purchase.
     */
    override fun finalizePurchase(paymentMethod: PaymentMethods): Purchase {
        val purchase = Purchase(purchaseList, id, LocalDate.now(), paymentMethod)
        purchaseHistory.add(purchase)
        purchaseList.clear()
        return purchase;
    }
    /**
     * Returns a previously completed purchase by removing it from the user's purchase history,
     * if the purchase is found in the history.
     *
     * @param purchase The [Purchase] object to be returned.
     */
    override fun returnPurchase(purchase: Purchase) {
        if (purchaseHistory.contains(purchase)) {
            purchaseHistory.remove(purchase)
            println("Purchased was return successfully")
        } else {
            println("Purchase not found in s history.")
        }
    }
    /**
     * Prints basic user information, including name, ID, and email.
     * This can be overridden in subclasses to include additional user-specific information.
     */
    open fun printUserInfo() {
        println("name: ${name} id: ${id} email: ${email}")
    }

}