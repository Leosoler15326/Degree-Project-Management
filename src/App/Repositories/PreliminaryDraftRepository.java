package App.Repositories;

import App.DataBase.DataBase;
import App.Entities.PreliminaryDraft;
import App.interfaces.IRepository;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PreliminaryDraftRepository {
    private DataBase _DataBase;

    public PreliminaryDraftRepository(DataBase db) {
        this._DataBase = db;
    }

    public boolean Add(PreliminaryDraft prmItem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}