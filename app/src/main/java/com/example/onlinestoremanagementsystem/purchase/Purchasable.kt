package com.example.onlinestoremanagementsystem.purchase
/**
 * Interface for objects that can be purchased within the store system.
 */
interface purchasable {
    /**
     * Finalizes a purchase, recording it in the user's history and clearing the purchase list.
     *
     * @param paymentMethod The payment method used to complete the purchase.
     * @return A [Purchase] object representing the completed purchase.
     */
    fun finalizePurchase(paymentMethod : PaymentMethods, ) : Purchase
    /**
     * Returns a previously completed purchase, removing it from the user's purchase history.
     *
     * @param purchase The purchase to be returned.
     */
    fun returnPurchase(purchase : Purchase)
}