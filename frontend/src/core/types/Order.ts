import { Tracking } from "./Tracking";

export type Order = {
    id: number;
    description: string;
    trackings: Tracking[];
}