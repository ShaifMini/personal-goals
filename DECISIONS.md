# Decisions Log

Architectural decisions for the Android playground app, with reasoning.
Newest at top.

## Open Threads
_Unfinished work to resume next session. Coach updates at wrap-up._

- **Next focus: Room / data layer.** Reading queue seeded in [READING.md](READING.md). Open Room questions in [CONFUSION.md](CONFUSION.md). First architectural decisions to make: entity boundaries, DAO return types (Flow vs suspend), where transactions live, migration testing strategy.
- **Deferred (architectural — decide with coach):** multi-module split (`:core:database`, `:core:network`, `:core:domain`, `:feature:*`). Don't scaffold until baseline Room layer exists in `:app` and you can articulate what each module would own.

---

## Template
### YYYY-MM-DD — <decision>  `[tag: room|network|compose|layering|other]`
- **Decided:**
- **Alternatives considered:**
- **Why:**
- **Refs:** `<file:line>` or `<commit sha>`
- **Revisit if:** `<condition that would invalidate this>`
- **Status:** active  _(active | superseded by <date> | obsolete)_

---

## Decisions