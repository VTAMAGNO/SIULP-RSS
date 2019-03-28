package com.rss.siulp;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.provider.DocumentsContract;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created on 28/03/2019.
 */

public class ReadRSS extends AsyncTask<Void,Void,Void> {

    Context context;
    String address="https://www.siulpancona.it/?feed=rss2";
    ProgressDialog progress;
    ArrayList<FeedItem> feeds;
    RecyclerView recyclerView;
    Boolean ancona;
    Boolean italia;
    URL url;

    public ReadRSS(Context context, RecyclerView recyclerView, Boolean ancona, Boolean italia){
        this.recyclerView = recyclerView;