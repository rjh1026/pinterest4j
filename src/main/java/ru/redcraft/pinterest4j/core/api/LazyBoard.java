package ru.redcraft.pinterest4j.core.api;

import java.util.List;

import ru.redcraft.pinterest4j.Board;
import ru.redcraft.pinterest4j.BoardCategory;
import ru.redcraft.pinterest4j.Pin;

public class LazyBoard implements Board {

	private final long id;
	private final String url;
	private final String title;
	private String description = null;
	private BoardCategory category = null;
	private final BoardAPI boardAPI;
	
	
	LazyBoard(long id, String url, String title, BoardAPI boardAPI) {
		super();
		this.id = id;
		this.url = url;
		this.title = title;
		this.boardAPI = boardAPI;
	}
	
	public LazyBoard(long id, String url, String title, String description,
			BoardCategory category, BoardAPI boardAPI) {
		super();
		this.id = id;
		this.url = url;
		this.title = title;
		this.description = description;
		this.category = category;
		this.boardAPI = boardAPI;
	}

	public long getId() {
		return id;
	}

	public String getURL() {
		return url;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public BoardCategory getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getPinsCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPageCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getFollowersCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Pin> getAllPins() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Pin> getPins(int pageNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "LazyBoard [id=" + id + ", url=" + url + ", title=" + title
				+ "]";
	}

}