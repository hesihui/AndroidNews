package com.tinncreation.tinnews.ui.save;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.tinncreation.tinnews.model.Article;
import com.tinncreation.tinnews.repository.NewsRepository;

import java.util.List;

public class SaveViewModel extends ViewModel {
    private final NewsRepository repository;

    public SaveViewModel(NewsRepository repository){
        this.repository = repository;
    }

    public LiveData<List<Article>> getAllSavedArticles(){
        return repository.getAllSavedArticles();
    }

    public void deleteSavedArticles(Article article){
        repository.deleteSavedArticle(article);
    }
}
