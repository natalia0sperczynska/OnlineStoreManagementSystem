package com.example.onlinestoremanagementsystem.products

import com.example.onlinestoremanagementsystem.products.categories.CategoryBeautyProduct
/**
 * Represents a beauty-related product in the store.
 *
 * @property id The unique identifier for the product.
 * @property name The name of the product.
 * @property status The availability status of the product.
 * @property price The price of the product in the store.
 * @property isTestedOnAnimals Whether the product is tested on animals.
 * @property category The beauty category (e.g., FACE, HAIR, BODY).
 */
class BeautyProduct(
    override val id: String,
    override val name: String,
    override var status: Enum<Status>,
    override var price: Double,
    val isTestedOnAnimals: Boolean,
    val category: Enum<CategoryBeautyProduct>
) : Product() {
    /**
     * Prints all information about the beauty product, including animal testing status and category.
     * Calls the superclass's `printAllProductInfo` method and adds category information.
     */
    override fun printAllProductInfo() {
        super.printAllProductInfo()
        println("is tested on animals : ${isTestedOnAnimals} category: ${category}")
    }
}