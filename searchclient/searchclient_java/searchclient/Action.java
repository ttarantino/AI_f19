package searchclient;

enum ActionType
{
    NoOp,
    Move,
    Push,
    Pull
}

public enum Action
{
    NoOp("NoOp", ActionType.NoOp, 0, 0, 0, 0),

    MoveN("Move(N)", ActionType.Move, -1, 0, 0, 0),
    MoveS("Move(S)", ActionType.Move, 1, 0, 0, 0),
    MoveE("Move(E)", ActionType.Move, 0, 1, 0, 0),
    MoveW("Move(W)", ActionType.Move, 0, -1, 0, 0),

    /* PUSHING AROUND CORNERS COMMENTED OUT FOR PART 1 EX 4 */
    PushNN("Push(N,N)", ActionType.Push, -1, 0, -1, 0),
    // PushNE("Push(N,E)", ActionType.Push, -1, 0, 0, 1),
    // PushNW("Push(N,W)", ActionType.Push, -1, 0, 0, -1),
    PushSS("Push(S,S)", ActionType.Push, 1, 0, 1, 0),
    // PushSE("Push(S,E)", ActionType.Push, 1, 0, 0, 1),
    // PushSW("Push(S,W)", ActionType.Push, 1, 0, 0, -1),
    // PushEN("Push(E,N)", ActionType.Push, 0, 1, -1, 0),
    // PushES("Push(E,S)", ActionType.Push, 0, 1, 1, 0),
    PushEE("Push(E,E)", ActionType.Push, 0, 1, 0, 1),
    // PushWN("Push(W,N)", ActionType.Push, 0, -1, -1, 0),
    // PushWS("Push(W,S)", ActionType.Push, 0, -1, 1, 0),
    PushWW("Push(W,W)", ActionType.Push, 0, -1, 0, -1),

    /* PULLING AROUND CORNERS COMMENTED OUT FOR PART 1 EX 4 */
    PullNS("Pull(N,S)", ActionType.Pull, -1, 0, 1, 0),
    // PullNE("Pull(N,E)", ActionType.Pull, -1, 0, 0, 1),
    // PullNW("Pull(N,W)", ActionType.Pull, -1, 0, 0, -1),
    PullSN("Pull(S,N)", ActionType.Pull, 1, 0, -1, 0),
    // PullSE("Pull(S,E)", ActionType.Pull, 1, 0, 0, 1),
    // PullSW("Pull(S,W)", ActionType.Pull, 1, 0, 0, -1),
    // PullEN("Pull(E,N)", ActionType.Pull, 0, 1, -1, 0),
    // PullES("Pull(E,S)", ActionType.Pull, 0, 1, 1, 0),
    PullEW("Pull(E,W)", ActionType.Pull, 0, 1, 0, -1),
    // PullWN("Pull(W,N)", ActionType.Pull, 0, -1, -1, 0),
    // PullWS("Pull(W,S)", ActionType.Pull, 0, -1, 1, 0),
    PullWE("Pull(W,E)", ActionType.Pull, 0, -1, 0, 1);

    public final String name;
    public final ActionType type;
    public final int agentRowDelta;
    public final int agentColDelta;
    public final int boxRowDelta;
    public final int boxColDelta;

    Action(String name, ActionType type, int ard, int acd, int brd, int bcd)
    {
        this.name = name;
        this.type = type;
        this.agentRowDelta = ard;
        this.agentColDelta = acd;
        this.boxRowDelta = brd;
        this.boxColDelta = bcd;
    }
}
