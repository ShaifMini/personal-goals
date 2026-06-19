# Confusion Debt

Append-only list of things I half-understand. Burn down weekly.
Better signal than tutorial completion — names the gap honestly.

## Format
- `[tag]` Question — _opened YYYY-MM-DD_
  - _Resolved YYYY-MM-DD: <one-line answer or link to DECISIONS entry>_

Items stay until I can explain them out loud without notes.

---

## Open

### Room (seed list — verify which you actually own)
- `[room]` When `@Embedded` vs `@Relation` vs manual join in a query?
- `[room]` What does `withTransaction` actually guarantee vs a single `@Transaction` DAO method?
- `[room]` `@Insert(onConflict = REPLACE)` — what does REPLACE do to child rows under foreign keys?
- `[room]` Auto-migrations vs manual `Migration` — when does auto break down?
- `[room]` Why declare `@Index` — what queries benefit, what's the write-cost tradeoff?
- `[room]` `Flow<List<X>>` from DAO — what triggers re-emission, and what doesn't?
- `[room]` Type converters — where do they run, and what happens with nullable columns?
- `[room]` `MigrationTestHelper` — how does it differ from running migrations against a real DB?

### Coroutines / Flow (preview — for after Room)
- `[flow]` `StateFlow` vs `SharedFlow(replay=1)` — when does the difference matter?
- `[flow]` `WhileSubscribed(5_000)` vs `Lazily` vs `Eagerly` — what scenario picks each?
- `[flow]` `flowOn` vs `withContext` — why is one wrong inside a flow builder?

---

## Resolved
