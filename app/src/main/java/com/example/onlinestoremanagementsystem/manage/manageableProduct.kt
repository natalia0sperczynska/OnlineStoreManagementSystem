package com.example.onlinestoremanagementsystem.manage

import com.example.onlinestoremanagementsystem.products.Product
/**
 * Interface for managing product-related actions within the store system.
 */
interface manageableProduct {
    /**
     * Adds a product to the store.
     *
     * @param product The product to be added.
     * @param management The store management instance responsible for adding products.
     */
    fun addProduct(product: Product, management: Management) {
        management.addProduct(product)
    }

    /**
     * Removes a product from the store.
     *
     * @param product The product to be removed.
     * @param management The store management instance responsible for removing products.
     */
    fun removeProduct(product: Product, management: Management) {
        management.removeProduct(product)
    }
}