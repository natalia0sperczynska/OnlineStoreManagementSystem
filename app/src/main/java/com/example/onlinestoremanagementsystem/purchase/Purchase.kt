package com.example.onlinestoremanagementsystem.purchase
import com.example.onlinestoremanagementsystem.products.Product
import java.time.LocalDate
/**
 * Represents a purchase transaction in the store.
 *
 * @property purchaseList List of products included in this purchase.
 * @property customerId ID of the customer making the purchase.
 * @property dateOfPurchase The date the purchase was made.
 * @property paymentMethod The payment method used for the purchase.
 */
data class Purchase (
    val purchaseList: List<Product>,
    val customerId: Int,
    val dateOfPurchase:LocalDate,
    val paymentMethod : Enum<PaymentMethods>
) {
    /**
     * Returns a string representation of the Purchase instance, including
     * a list of product names, the customer ID, purchase date, and payment method.
     *
     * @return A formatted string summarizing the purchase details.
     */
    override fun toString(): String {
        return """
            Purchase Details:
            - Customer ID: $customerId
            - Date of Purchase: $dateOfPurchase
            - Payment Method: $paymentMethod
            - Products: ${purchaseList.joinToString()}
        """
    }
}