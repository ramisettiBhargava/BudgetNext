package com.familybudget.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.familybudget.entity.Category;
import com.familybudget.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    // Save Category
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    // Get All Categories
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Get Category By ID
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    // Update Category
    public Category updateCategory(Long id, Category category) {
        Category existing = categoryRepository.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(category.getName());
            existing.setType(category.getType());
            return categoryRepository.save(existing);
        }

        return null;
    }

    // Delete Category
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}