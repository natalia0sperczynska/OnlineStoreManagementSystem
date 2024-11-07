package com.example.onlinestoremanagementsystem.products

import com.example.onlinestoremanagementsystem.products.categories.CategoryFashionProduct
/**
 * Represents a fashion-related product in the store, such as clothing.
 *
 * @property id The unique identifier for the product.
 * @property name The name of the product.
 * @property status The availability status of the product.
 * @property price The price of the product in the store.
 * @property size The size of the fashion product (e.g., small, medium, large).
 * @property material The material of the product (e.g., cotton, leather).
 * @property category The category of fashion (e.g., MALE, FEMALE, KIDS).
 */
class FashionProduct(
    override val id: String,
    override val name: String,
    override var status: Enum<Status>,
    override var price: Double,
    val size: String,
    val material: String,
    val category: Enum<CategoryFashionProduct>
) : Product() {
    /**
     * Prints all information about the fashion product, including size, material, and category.
     * Calls the superclass's `printAllProductInfo` method and adds category information.
     */
    override fun printAllProductInfo() {
        super.printAllProductInfo()
        println("size: ${size} material: ${material} category:${category}")
    }
}