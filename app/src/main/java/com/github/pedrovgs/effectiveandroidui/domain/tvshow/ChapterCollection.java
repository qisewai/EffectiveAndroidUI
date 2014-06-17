package com.github.pedrovgs.effectiveandroidui.domain.tvshow;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Collection of chapters. Contains all the chapters information for each TvShow. This
 * implementation is based on a LinkedHashSet.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
public class ChapterCollection {

  private final LinkedHashSet<Chapter> chapters;

  public ChapterCollection() {
    this.chapters = new LinkedHashSet<Chapter>();
  }

  public Collection<Chapter> getChapters() {
    return (Set<Chapter>) chapters.clone();
  }

  public void add(Chapter chapter) {
    this.chapters.add(chapter);
  }
}
