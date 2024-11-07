package com.example.onlinestoremanagementsystem.products

import com.example.onlinestoremanagementsystem.users.User
/**
 * Represents a generic product in the store.
 */
abstract class Product {
    abstract val id: String
    abstract val name: String
    abstract var status: Enum<Status>
    abstract var price: Double

    /**
     * Prints basic information about the product.
     */
    fun printProductInfo() {
        println("${name} id: ${id} status: ${status} price: ${price}")
    }
    /**
     * Prints detailed information about the product, including name, ID, status, and price.
     * Subclasses can override this method to include additional product-specific details.
     */
    open fun printAllProductInfo() {
        println("${name} id: ${id} status: ${status} price: ${price}")
    }
    /**
     * Adds a product to a user's purchase list if it is available and not already on their list.
     * Updates the product's status to indicate it has been purchased.
     *
     * @param product The product to be added to the purchase list.
     * @param user The user to whom the product will be added.
     */
    fun addProductToPurchaseList(product: Product, user: User) {
        if (user.purchaseList.contains(product)) {
            println("this product is already on the purchase list")
        } else if (product.status == Status.AVAILABLE) {
            user.purchaseList.add(product)
            product.status = Status.NOT_AVAILABLE
            println("product was added successfully to the purchase list")
        } else {
            println("product is not available")
        }
    }
    /**
     * Removes a product from a user's purchase list if it is currently on the list.
     * Updates the product's status to indicate it is available again.
     *
     * @param product The product to be removed from the purchase list.
     * @param user The user from whose purchase list the product will be removed.
     */
    fun removeProductFromPurchaseList(product: Product, user: User) {
        if (user.purchaseList.contains(product)) {
            user.purchaseList.remove(product)
            println("product was removed successfully from the purchase list")
            product.status = Status.AVAILABLE
        } else {
            println("product is not on your purchase list ")
        }
    }

}

