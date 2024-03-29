package org.dav.learn.enterprise.notebook.service;

import org.dav.learn.enterprise.notebook.entity.Note;

import java.util.List;

public interface NoteService {
    Note getNoteById(Integer id);
    void saveNote(Note note);
    void updateNote(Integer id, String message, boolean done);
    void deleteNote(Integer id);
    List<Note> findAll();
    List<Note> findAllByOrderByDateAsc();
    List<Note> findAllByOrderByDateDesc();
}
